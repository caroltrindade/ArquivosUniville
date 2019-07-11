import time

def getTempoExecucao(carga):
    return carga[1:]

def getTipoExecucao(carga):
    return carga[0:1]

def findIndex(array, value):
    try:
        return array.index(value)
    except:
        return -1

processos = [["P1", 2, ["C10", "E5", "C4"]], ["P2", 1, ["C2", "E10", "C1"]], ["P3", 2, ["C16", "E1", "C10"]], ["P4", 0, ["C4", "E1", "C1", "E1", "C1"]]]
qtdProcessos = len(processos)
processados = []
quantum = 10
interrompido = False
tempoExecucao = 0

while len(processados) != qtdProcessos:
    for i in range(0, qtdProcessos):
        [nome, prioridade, cargas] = processos[i]
        
        cargasEmExecucao = list.copy(cargas)

        for j in range(0, len(cargas)):
            carga = cargas[j]

            tipo = getTipoExecucao(carga)
            tempo = getTempoExecucao(carga)
            tempoRestante = int(tempo)

            if int(tempo) == 0: continue

            print('A carga do tipo:', tipo, ', do processo nome:', nome, ' deve ser executada por:', tempo, ' u.t')
            while tempoRestante > 0:
                if tempoExecucao >= quantum:
                    tempoExecucao = 0
                    interrompido = True
                    print('Carga interrompida devido ao limite do quantum para o processo.')
                    break
                
                print('Tempo restante: ', tempoRestante)
                tempoExecucao += 1
                tempoRestante -= 1
                time.sleep(1) # espera 1s

            cargasEmExecucao[j] = tipo + str(tempoRestante)

            if interrompido:
                interrompido = False
                break

        if findIndex(processados, nome) == -1:
            # verifica se todas as cargas do processo foram executadas
            finalizou = True
            for carga in cargasEmExecucao:
                tempo = getTempoExecucao(carga)

                if int(tempo) != 0:
                    finalizou = False
                    break

            if finalizou:
                processados.append(nome)
                processos[i][2] = []
            else:
                processos[i][2] = cargasEmExecucao

print('Finalizou a execução')