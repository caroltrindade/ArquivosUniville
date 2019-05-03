1. Crie um script que solicite ao usuário digitar o seu nome e imprime o conteúdo no terminal. 
    ```
    Exemplo: 
    Digite o seu nome: Idris Elba 
    Bom dia Idris Elba 
    ```

    ```shell
    #!/usr/bash
    echo "Digite o seu nome: "
    read nome
    echo "Bom dia $nome"
    ```

1. Crie um script que multiplique dois números que o usuário informar
    ```
    Primeiro Número: 2 
    Segundo Numero: 3 
    Resultado: 6
    ```

    ```shell
    #!/usr/bash
    echo "Primeiro Número: "
    read num1
    echo "Segundo Número: "
    read num2
    result=$[ $num1 * $num2 ]
    # Caso não funcione no emulador, favor utilizar result=$(( $num1 * $num2 ))
    echo "Resultado: $result"
    ```

1. Crie um script que identifique se o usuário informou um número positivo, negativo ou zero
    ```
    Numero: 2
    Positivo
    ```

    ```shell

    #!/usr/bash
    echo "Número: "
    read num

    if [ $num -lt 0 ]; then 
        resultado="Negativo"
    elif [ $num -gt 0 ]; then 
        resultado="Positivo"
    else 
        resultado="Zero"
    fi

    echo "O Número é: $resultado"
    ```

1. Crie um script que resolva a tabuada do número informado pelo usuário.
    ```
    Número: 2 
    2x0 = 1 
    2x1 = 2 
    ... 
    2x10 = 20
    ```

    ```shell
    #!/usr/bash
    echo "Número: "
    read num

    # Caso não funcione no emulador, favor utilizar $(( ... )) no lugar de $[ ... ]

    i=0
    while [ $i -le 10 ]; do
        resultado=$[ $num * $i ]
        
        echo "$num x $i = $resultado"

        i=$[ $i + 1]
    done

    ```

1. Crie um script que apresente duas opções ao usuário. A primeira opção deverá mostrar o calendário. A segunda opção deve mostrar a lista de arquivos do diretório
    ```
    Opcões:
    —–
    1: Calendário
    2: Listas de arquivos do diretório
    —–
    Informe sua opção: 2
    —–
    Mostrar arquivos do diretório
    —–
    arquivo.txt diretório arquivo2.txt
    ```

    ```shell
    #!/usr/bash
    echo "Opções: "
    echo "1: Calendário"
    echo "2: Mostrar Lista de arquivos do diretório"
    read opcao

    if [ $opcao -eq 1 ]; then 
        echo "Mostrar Calendário"
        cal
    elif [ $opcao -eq 2 ]; then 
        echo "Mostrar arquivos do diretório"
        ls
    fi

    ```
