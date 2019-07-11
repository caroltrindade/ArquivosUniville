# Método main

import time

# Obtém o processo com a maior prioridade
def ObterProcessoMaiorPrioridade(processos):
    
    for proc in processos:
        prioridade = proc[1]

        if processos.index(proc) == 0: 
            prioridadeMaiorProcesso = prioridade
            numeroProcessoMaiorPrioridade = processos.index(proc)

        if prioridade > prioridadeMaiorProcesso:
            numeroProcessoMaiorPrioridade = processos.index(proc)

    return numeroProcessoMaiorPrioridade



# Método inicializador
def main():
    # Definição dos processos
    # [nome do processo, prioridade,carga,carga restante]
    #processos = [["P1",2,["C10","E5","C4"],["C10","E5","C4"]],
    #["P2",1,["C2","E10","C1"],["C2","E10","C1"]],
    #["P3",2,["C16","E1","C10"],["C16","E1","C10"]],
    #["P4",0,["C4","E1","C1","E1","C1"],["C4","E1","C1","E1","C1"]]]
    
    processos = [["P1",2,["C10","E5","C4"]],
    ["P2",1,["C2","E10","C1"]],
    ["P3",2,["C16","E1","C10"]],
    ["P4",0,["C4","E1","C1","E1","C1"]]]

    print("Simulador Escalonamento")
    print("\n")

    # Exeução dos processos
    for numeroProceso in range (len(processos)):
        processo = processos[numeroProceso]
        nomeProcesso = processo[0]
        prioridadeProcesso = processo[1]
        cargaTrabalho = processo[2]

        print("")
        print("Executanto o processo:", nomeProcesso)
        print("Prioridade do processo: ", prioridadeProcesso)

        for carga in cargaTrabalho:
            tipoCarga = carga[0:1]
            duracaoProcesso = carga[1:]
            duracaoProcesso = int(duracaoProcesso)

            if tipoCarga == "C": descCarga = "Processamento"
            if tipoCarga == "E": descCarga = "Entrada/Saída"

            print("")
            print("Tipo da carga de trabalho: ", descCarga)
            print("Tempo estimado de execução: ", duracaoProcesso)
            print("Processamento: ")

            for cont in range(duracaoProcesso):
                print("Tempo restante: ", (duracaoProcesso - cont))
                
                if tipoCarga == "E":

                    # Busca o próximo processo para executar na CPU enquanto o processo principal está esperando Entrada/Saída
                    numeroSegundoProcesso = numeroProceso + 1 
                    segundoProcesso = processos[numeroSegundoProcesso]

                    nomeSegundoProcesso = segundoProcesso[0]
                    prioridadeSegundoProcesso = segundoProcesso[1]
                    cargaTrabalhoSegundoProcesso = segundoProcesso[2]

                    cargaSegundoProcesso = cargaTrabalhoSegundoProcesso[0]
                    tipoCargaSegundoProcesso = carga[0:1]
                    duracaoSegundoProcesso = cargaSegundoProcesso[1:]
                    duracaoSegundoProcesso = int(duracaoSegundoProcesso)

                    if tipoCargaSegundoProcesso == "C": descCargaSegundoProcesso = "Processamento"
                    if tipoCargaSegundoProcesso == "E": descCargaSegundoProcesso = "Entrada/Saída"

                    print("")
                    print("Executanto o processo secundário: ", nomeSegundoProcesso)
                    print("Prioridade do processo secundário: ", prioridadeSegundoProcesso)
                    print("Tipo da carga de trabalho do processo secundário: ", descCargaSegundoProcesso)
                    print("Tempo estimado de execução do processo secundário: ", duracaoSegundoProcesso)
                    print("Tempo restante do processo secundário:  ", duracaoSegundoProcesso - 1)
                    
                    # Busca a primeira carga e vai eliminando
                    print(" f ",cargaSegundoProcesso)

                    cargaSegundoProcesso = tipoCargaSegundoProcesso + str(duracaoSegundoProcesso - 1)

                    if duracaoSegundoProcesso == 0: del (cargaTrabalhoSegundoProcesso[0])
                    else: cargaTrabalhoSegundoProcesso[0] = cargaSegundoProcesso
                    
                    segundoProcesso[2] = cargaTrabalhoSegundoProcesso

                    processos[numeroSegundoProcesso] = segundoProcesso

                time.sleep(1)

            numeroProcessoMaiorPrioridade = ObterProcessoMaiorPrioridade(processos)

            if numeroProcessoMaiorPrioridade != numeroProceso:
                numeroProceso = numeroProcessoMaiorPrioridade
                break

   

if __name__ == "__main__":
    main()