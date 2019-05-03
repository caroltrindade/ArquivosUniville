1. Utilize o comando echo para imprimir seu nome no terminal

     ```bash
     echo "Carolina Trindade"
     Carolina Trindade
     ```

1. Utilize o comando echo para salvar seu nome em um arquivo chamado cliente01.txt. Confira o resultado com o comando less.

     ```bash
     echo "Carolina Trindade" > Cliente01.txt
     less Cliente01.txt
     ```

     ```bash
     Carolina Trindade
     ```

1. Utilize o comando echo para salvar o nome da cidade em que você nasceu no final do arquivo cliente01.txt.

     ```bash
     echo "Jaragua do Sul" >> Cliente01.txt
     less Cliente01.txt
     ```

     ```bash
     Carolina Trindade
     Jaragua do Sul
     ```

1. Crie um novo diretório chamado clientes com o comando mkdir. Confira o resultado com o comando ls.

     ```bash
     mkdir clientes
     ls
     ```

     ```bash
     clientes  dos       hello.c
     ```

1. Mova o arquivo cliente 01.txt para o diretório clientes. Confira o resultado com os comandos ls e cd.

     ```bash
     mv Cliente01.txt clientes
     cd clientes
     ls
     ```

     ```bash
     Cliente01.txt
     ```

1. Crie uma cópia do arquivo cliente 01.txt com o comando cp chamado cliente01.txt.bkp.

     ```bash
     cp Cliente01.txt Cliente01.txt.bkp
     ls
     ```

     ```bash
     Cliente01.txt      Cliente01.txt.bkp
     ```

     ```bash
     less Cliente01.txt.bkp
     ```

     ```bash
     Carolina Trindade
     Jaragua do Sul
     ```

1. Remova o arquivo cliente 01.txt com o comando rm. Confira o resultado.

     ```bash
     ls
     ```

     ```bash
     Cliente01.txt      Cliente01.txt.bkp
     ```

     ```bash
     rm Cliente01.txt
     ls
     ```

     ```bash
     Cliente01.txt.bkp
     ```

1. Crie um arquivo chamado de cliente.script com todos os comandos utilizados acima, na mesma ordem de execução.

     ```shell
     vi cliente.script
     #!/usr/bash
     echo "Carolina Trindade"
     echo "Carolina Trindade" > Cliente01.txt 
     echo "Jaragua do Sul" >> Cliente01.txt
     mkdir clientes
     mv Cliente01.txt clientes
     cd clientes
     cp Cliente01.txt Cliente01.txt.bkp
     rm Cliente01.txt
     ```

     ```bash
     ls
     ```

     ```bash
     cliente.script  dos             hello.c
     ```

1. Modifique o arquivo cliente.script com o comando chmod para se tornar um arquivo executável. Execute o arquivo e confira o resultado. Para executar utilize o comando ./cliente.script. Obs: exclua a pasta clientes antes de executar o script para garantir que está funcionando corretamente.

     ```bash
     chmod -x cliente.script
     ls
     ```

     ```bash
     cliente.script  clientes        dos             hello.c
     ```

     ```bash
     sh cliente.script
     ```

1. Execute o comando cal. Observe o resultado. Execute o comando echo|cal >hoje.txt. Utilize o comandos ls e less para conferir o resultado. O que ocorreu? Qual a função do operador |?

     ```bash
     cal
     ```

     ```bash
          April 2019
     Su Mo Tu We Th Fr Sa
     1  2  3  4  5  6
     7  8  9 10 11 12 13
     14 15 16 17 18 19 20
     21 22 23 24 25 26 27
     28 29 30
     ```

     ```bash
     echo | cal > hoje.txt
     ls
     ```

     ```bash
     Cliente01.txt.bkp  hoje.txt
     ```

     ```bash
     less hoje.txt
     ```

     ```bash
          April 2019
     Su Mo Tu We Th Fr Sa
     1  2  3  4  5  6
     7  8  9 10 11 12 13
     14 15 16 17 18 19 20
     21 22 23 24 25 26 27
     28 29 30
     ```

     ```
     Foi criado um arquivo onde seu conteído é o calendário.

     A função do operador "|" (pipe) trata-se de concatenar comandos, isto é, juntá-los.
     Ele obtém o conteúdo retornado pelo comando anterior e envia para o próximo comando, para que este por sua vez possa ser executado com base no resultado anterior.
     Porém, neste caso, este operador não é muito útil, visto que é possível executar a linha de comando sem este operador
     ```

1. Utilize o comando wget para baixar o arquivo cidades sc.txt no endereço https://gist.githubusercontent.com/leandersonandre/c8cba982f42262591be628e5397d1c3f/raw/bd13a3e13823708e477f99f9285f845b292714c6/cidades_sc.txt.

     ```bash
     wget https://gist.githubusercontent.com/leandersonandre/c8cba982f42262591be628e5397d1c3f/raw/bd13a3e13823708e477f99f9285f845b292714c6/cidades_sc.txt
     ```

     ```bash
     Connecting to gist.githubusercontent.com (151.101.0.133:443)
     cidades_sc.txt       100% |*******************************|  3464   0:00:00 ETA
     ```

     ```bash
     ls
     ```

     ```bash
     cidades_sc.txt  dos             hello.c
     ```

1. Execute o comando grep Balneario cidades sc.txt. Qual é o resultado?

     ```bash
     grep Balneario cidades_sc.txt
     ```

     ```bash
     Balneario Arroio do Silva
     Balneario Barra do Sul
     Balneario Camboriu
     Balneario Gaivota
     ```

     ```
     Retorna todas as cidades que possuem "Balneario" no nome.
     ```

1. Execute o comando grep balneario cidades_sc.txt. Qual é o resultado?

     ```bash
     grep balneario cidades_sc.txt
     ```

     ```
     Não ocorreu nada, já que não há a palavra balneario no arquivo. 
     Lembrando que são diferenciadas letras maiúsculas e minúsculas.
     ```

1. Execute o comando grep ”do Sul” cidades sc.txt. Qual é o resultado?

     ```bash
     grep "do Sul" cidades_sc.txt
     ```

     ```bash
     Balneario Barra do Sul
     Bocaina do Sul
     Campo Belo do Sul
     Caxambu do Sul
     Cocal do Sul
     Formosa do Sul
     Guaruja do Sul
     Jaragua do Sul
     Lindoia do Sul
     Rio do Sul
     Santa Rosa do Sul
     Santiago do Sul
     Sao Bento do Sul
     Sao Cristovao do Sul
     Sao Francisco do Sul
     Sao Joao do Sul
     Timbe do Sul 
     ```

     ```
     Foram obtidas todas as cidades que contenham "do Sul" em seu nome
     ```

1. Utilize os comandos cat e grep para filtrar as cidades que começam com o nome Balneario.

     ```bash
     cat cidades_sc.txt | grep "Balneario"
     ```

     ```bash
     Balneario Arroio do Silva
     Balneario Barra do Sul
     Balneario Camboriu
     Balneario Gaivota
     ```

1. Crie um arquivo chamado balneario.txt com o conteúdo filtrado no problema 15
     ```bash
     echo "Balneario Arroio do Silva" > balneario.txt
     echo "Balneario Barra do Sul" >> balneario.txt
     echo "Balneario Camboriu" >> balneario.txt
     echo "Balneario Gaivota" >> balneario.txt
     less balneario.txt
     ```

     ```bash
     Balneario Arroio do Silva
     Balneario Barra do Sul
     Balneario Camboriu
     Balneario Gaivota
     ```

1. Compacte o arquivo balneario.txt, nomeando de compactado.tar com o comando tar.

     ```bash
     tar -cf compactado.tar balneario.txt
     ls
     ```

     ```bash
     balneario.txt   cidades_sc.txt  compactado.tar  dos             hello.c
     ```

1. Descompacte o arquivo compactado.tar com o comando tar

     ```bash
     rm balneario.txt
     ls
     ```

     ```bash
     cidades_sc.txt  compactado.tar  dos             hello.c
     ```

     ```bash
     tar -xvf compactado.tar balneario.txt
     ```

     ```bash
     balneario.txt
     ```

     ```bash
     ls
     ```

     ```bash
     balneario.txt   cidades_sc.txt  compactado.tar  dos             hello.c
     ```