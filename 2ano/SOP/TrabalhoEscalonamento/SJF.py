import time

def getTempoExecucao(carga):
    return carga[1:]

def getTipoExecucao(carga):
    return carga[0:1]

def sortByCarga(processo):
    return processo[3]

processos = [["P1", 2, ["C10", "E5", "C4"]], ["P2", 1, ["C2", "E10", "C1"]], ["P3", 2, ["C16", "E1", "C10"]], ["P4", 0, ["C4", "E1", "C1", "E1", "C1"]]]
qtdProcessos = len(processos)
tempoTotalExecucao = 0

# ordena as entradas por tempo de carga de trabalho
for i in range(qtdProcessos):
    [nome, prioridade, cargas] = processos[i]

    somaCargas = 0
    for carga in cargas:
        tempo = getTempoExecucao(carga)

        somaCargas = somaCargas + int(tempo)
    
    processos[i].append(somaCargas)
    print (somaCargas)

processos.sort(key = sortByCarga)
print(processos)

# processa as entradas ordenadas
for i in range(qtdProcessos):
    [nome, prioridade, cargas, tempoDuracao] = processos[i]
    
    for carga in cargas:
        tipo = getTipoExecucao(carga)
        tempo = getTempoExecucao(carga)
        tempoExecucao = 0
        
        print('A carga do tipo:', tipo, ', do processo nome:', nome, ' deve ser executada por:', tempo, ' u.t')
        while tempoExecucao < int(tempo):
            print('Tempo restante: ', int(tempo) - tempoExecucao)
            tempoExecucao += 1
            time.sleep(1) # espera 1s
        
        tempoTotalExecucao += tempoExecucao

print('Tempo de turnaround médio: ', float(tempoTotalExecucao/qtdProcessos))