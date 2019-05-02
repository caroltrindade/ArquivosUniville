1. Utilize o comando echo para imprimir seu nome no terminal
```shell
[root@localhost ~]# echo "Carolina Trindade"
Carolina Trindade
```

2. Utilize o comando echo para salvar seu nome em um arquivo chamado cliente01.txt. Confira o resultado com o comando less.
```shell
[root@localhost ~]# echo "Carolina Trindade" > Cliente01.txt
[root@localhost ~]# less Cliente01.txt
Carolina Trindade
~
~
~
[root@localhost ~]#
```

3. Utilize o comando echo para salvar o nome da cidade em que você nasceu no final do arquivo cliente01.txt.
```shell
[root@localhost ~]# echo "Jaragua do Sul" >> Cliente01.txt
[root@localhost ~]# less Cliente01.txt
Carolina Trindade
Jaragua do Sul
~
~
~
```

Crie um novo diretório chamado clientes com o comando mkdir. Confira o resultado com o comando ls.
[root@localhost ~]# mkdir clientes
[root@localhost ~]# ls
clientes  dos       hello.c

Mova o arquivo cliente 01.txt para o diret´orio clientes. Confira o resultado com os comandos ls e cd.
[root@localhost ~]# mv Cliente01.txt clientes
[root@localhost ~]# cd clientes
[root@localhost clientes]# ls
Cliente01.txt

Crie uma cópia do arquivo cliente 01.txt com o comando cp chamado cliente01.txt.bkp.
[root@localhost clientes]# cp Cliente01.txt Cliente01.txt.bkp
[root@localhost clientes]# ls
Cliente01.txt      Cliente01.txt.bkp
[root@localhost clientes]# less Cliente01.txt.bkp
Carolina Trindade
Jaragua do Sul
~
~
~

Remova o arquivo cliente 01.txt com o comando rm. Confira o resultado.
[root@localhost clientes]# ls
Cliente01.txt      Cliente01.txt.bkp
[root@localhost clientes]# rm Cliente01.txt
[root@localhost clientes]# ls
Cliente01.txt.bkp

Crie um arquivo chamado de cliente.script com todos os comandos utilizados acima, na mesma ordem de execução.
echo "Carolina Trindade" > Cliente01.txt
[root@localhost ~]# vi clientes.script
#!/usr/bash
echo "Carolina Trindade"
echo "Carolina Trindade" > Cliente01.txt 
echo "Jaragua do Sul" >> Cliente01.txt
mkdir clientes
mv Cliente01.txt clientes
cd clientes
cp Cliente01.txt Cliente01.txt.bkp
rm Cliente01.txt
~
~
~
[root@localhost ~]# ls
cliente.script  dos             hello.c

Modifique o arquivo cliente.script com o comando chmod para se tornar um arquivo executável. Execute o arquivo e confira o resultado. Para executar utilize o comando ./cliente.script. Obs: exclua a pasta clientes antes de executar o script para garantir que está funcionando corretamente.

[root@localhost ~]# chmod -x cliente.script
[root@localhost ~]# ls
cliente.script  clientes        dos             hello.c
[root@localhost ~]# /cliente.script


Execute o comando cal. Observe o resultado. Execute o comando echo|cal >hoje.txt. Utilize o comandos ls e less para conferir o resultado. O que ocorreu? Qual a função do operador |?
	[root@localhost clientes]# cal
     April 2019
Su Mo Tu We Th Fr Sa
    1  2  3  4  5  6
 7  8  9 10 11 12 13
14 15 16 17 18 19 20
21 22 23 24 25 26 27
28 29 30
[root@localhost clientes]# echo|cal>hoje.txt
[root@localhost clientes]# ls
Cliente01.txt.bkp  hoje.txt
[root@localhost clientes]# less hoje.txt
     April 2019
Su Mo Tu We Th Fr Sa
    1  2  3  4  5  6
 7  8  9 10 11 12 13
14 15 16 17 18 19 20
21 22 23 24 25 26 27
28 29 30
~
~
~

A função deste operador trata-se de concatenar comandos, juntá-los.
Ele obtém o conteúdo retornado pelo comando anterior e manda para o próximo comando, para que este por sua vez possa ser executado com base no resultado anterior.

Utilize o comando wget para baixar o arquivo cidades sc.txt no endereço https://gist.githubusercontent.com/leandersonandre/c8cba982f42262591be628e5397d1c3f/raw/bd13a3e13823708e477f99f9285f845b292714c6/cidades_sc.txt.
[root@localhost ~]# wget https://gist.githubusercontent.com/leandersonandre/c8cb
a982f42262591be628e5397d1c3f/raw/bd13a3e13823708e477f99f9285f845b292714c6/cidade
s_sc.txt
Connecting to gist.githubusercontent.com (151.101.0.133:443)
cidades_sc.txt       100% |*******************************|  3464   0:00:00 ETA
[root@localhost ~]# ls
cidades_sc.txt  dos             hello.c

Execute o comando grep Balneario cidades sc.txt. Qual é o resultado?
[root@localhost ~]# grep Balneario cidades_sc.txt
Balneario Arroio do Silva
Balneario Barra do Sul
Balneario Camboriu
Balneario Gaivota

Execute o comando grep balneario cidades sc.txt. Qual é o resultado?
[root@localhost ~]# grep balneario cidades_sc.txt

Não ocorreu nada, já que não há a palavra balneario no arquivo. 
Lembrando que são diferenciadas letras maiúsculas e minúsculas.

Execute o comando grep ”do Sul”cidades sc.txt. Qual é o resultado?
[root@localhost ~]# grep "do Sul" cidades_sc.txt
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

Utilize os comandos cat e grep para filtrar as cidades que começam com o nome Balneario.
 
[root@localhost ~]# cat cidades_sc.txt | grep "Balneario"
Balneario Arroio do Silva
Balneario Barra do Sul
Balneario Camboriu
Balneario Gaivota

Crie um arquivo chamado balneario.txt com o conteúdo filtrado no problema 15.
[root@localhost ~]# echo "Balneario Arroio do Silva" > balneario.txt
[root@localhost ~]# echo "Balneario Barra do Sul" >> balneario.txt
[root@localhost ~]# echo "Balneario Camboriu" >> balneario.txt
[root@localhost ~]# echo "Balneario Gaivota" >> balneario.txt
[root@localhost ~]# less balneario.txt
Balneario Arroio do Silva
Balneario Barra do Sul
Balneario Camboriu
Balneario Gaivota
 
~
~
~

Compacte o arquivo balneario.txt, nomeando de compactado.tar com o comando tar.
[root@localhost ~]# tar -cf compactado.tar balneario.txt
[root@localhost ~]# ls
balneario.txt   cidades_sc.txt  compactado.tar  dos             hello.c

Descompacte o arquivo compactado.tar com o comando tar
[root@localhost ~]# rm balneario.txt
[root@localhost ~]# ls
cidades_sc.txt  compactado.tar  dos             hello.c
[root@localhost ~]# tar -xvf compactado.tar balneario.txt
balneario.txt
[root@localhost ~]# ls
balneario.txt   cidades_sc.txt  compactado.tar  dos             hello.c

