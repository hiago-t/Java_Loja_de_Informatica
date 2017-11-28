import time

acesso = False

while(acesso == False):
        lerUsuarios = open("C:/DBJ/usuarios.txt","r")
        user = str(input("\nLogin: "))
        pswd = str(input("Password: "))
        for linhas in lerUsuarios.readlines():
                linha = linhas.split(";")
                #print(linha)
                #       print("proximo")
                if(user == linha[0] and pswd == linha[1].replace('\n', '')):
                        time.sleep(0.3)
                        print("\nOlá, %s, seja bem-vindo!\n" % user)
                        acesso = True
        if(acesso == False):
                print("Senha incorreta")

print("Fim do programa")
