# Método main

import time

# Verifica se há algum processo com prioridade superior àquele que está executando
def VerificarExistenciaMaiorPrioridade(processos,processo):
    [nomeProcesso, prioridadeProcesso] = processo

    existe = False

    for proc in processos:
        prioridade = proc[1]

        if prioridade > prioridadeProcesso:
            indice = processos.index(proc)
            existe = True

    return existe,indice



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
    for numeroProceso in range (processos):
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
                    segundoProcesso = numeroProceso + 1 

                    nomeSegundoProcesso = segundoProcesso[0]
                    prioridadeSegundoProcesso = segundoProcesso[1]
                    cargaTrabalhoSegundoProcesso = segundoProcesso[2]

                    print("")
                    print("Executanto o processo secundário:", nomeProcesso)
                    print("Prioridade do processo secundário: ", prioridadeProcesso)

                    for carga in cargaTrabalhoSegundoProcesso:
                        


                time.sleep(1)

            
            processoDuranteES = segundoProcesso

                #existe,indice = VerificarExistenciaMaiorPrioridade(processos,processo)

    # Acumula os dados na variável e então os imprime

   

if __name__ == "__main__":
    main()
