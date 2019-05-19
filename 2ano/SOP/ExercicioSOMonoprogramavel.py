# --------- Simulador de Sistema operacional monoprogramável ---------
# Desenvolva um programa que simule um sistema operacional monoprogramável.
# O programa deverá ler um arquivo de entrada contendo a lista de processos que deverá ser executada.
# No arquivo conterá as informações de cada processo (nome, tipo e duração).
# 
# Exemplo do arquivo de entrada.txt:
# #nome #tipo #duracao
# p1 cpu 2
# p1 es 4
# p1 cpu 4
# p2 cpu 2
# 
# Cada unidade da duração do processamento do processo corresponderá a um ciclo do processador.
# E cada ciclo do processador deverá durar exatamente 1 segundo.
# O simulador deverá indicar qual o processo está executando, quanto tempo resta e qual é o seu tipo.
# 
# Exemplo da tela do simulador:
# Simulador SO Monotarefa
# 
# Executanto o processo: p1
# Tipo do processo: CPU
# Tempo estimado de execução: 8
# Tempo restante: 8
# 
# Ao final da execução o simulador deverá gerar um arquivo com o relatório da execução com as seguintes informações:
# 
# Exemplo do arquivo de saida.txt:
# 
# Tempo total de execução: XXX
# Tempo total de execução processos CPU: XXX
# Tempo total de execução processos ES: XXX
# Tempo de espera médio dos processos: XXX

# Método main

import time


def main():
    processos = {}
    arquivo = open('./arquivos/entrada.txt', 'r')
    linhas = arquivo.readlines()
    arquivo.close()

    print("Simulador SO Monotarefa")
    print("\n")

    for linha in linhas:
        [nomeProcesso, tipoProcesso, duracaoProcesso] = linha.split(" ")

        duracaoProcesso = int(duracaoProcesso, base=10)

        for cont in range(duracaoProcesso + 1):
            print("Executanto o processo:", nomeProcesso)
            print("Tipo do processo: ", tipoProcesso)
            print("Tempo estimado de execução: ", duracaoProcesso)
            print("Tempo restante: ", (duracaoProcesso - cont))
            print("\n")
            
            #if processos[tipoProcesso] == undefined:
            #    processos[tipoProcesso] = "TESTEW"
            
            time.sleep(1)

if __name__ == "__main__":
    main()
