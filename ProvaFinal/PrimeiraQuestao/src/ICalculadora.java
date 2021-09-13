/*imports...*/
import java.util.Scanner;
public interface ICalculadora {
    public boolean EhValida (String expressao);
    Object retorno = null;

    public default Object push(int[] pilha, int topo, int valor, int tam){
        // retorno (5+3*{2*(3+4)} se R: correta se (5+3*{2*{3=4} R: incorreta ou se 5+3*{2*3+4} R: incorreta
        if (topo == tam - 1){
            return retorno;
            //return retorno (5+3*{2*(3+4)}; // correta
            //return retorno (5+3*{2*{3=4}; // incorreta
            //return retorno 5+3*{2*3+4}; // incorreta
        }
        topo ++;
        pilha [topo] = valor;
        return retorno;
        //return retorno (5+3*{2*(3+4)};
        //return retorno (5+3*{2*{3=4};
        //return retorno 5+3*{2*3+4};

    }

    // Função para desempilhar um valor da pilha:

    public default Object pop(int[] pilha, int topo, int valor, int tam){
        // retorno (5+3*{2*(3+4)} se R: correta se (5+3*{2*{3=4} R: incorreta ou se 5+3*{2*3+4} R: incorreta
        if (topo == tam - 1){
            //return retorno (5+3*{2*(3+4)}; // correta
            //return retorno (5+3*{2*{3=4}; // incorreta
            //return retorno 5+3*{2*3+4}; // incorreta
            return retorno;
        }
        valor = pilha [topo];
        topo--;
        //return retorno (5+3*{2*(3+4)}; // correta
        //return retorno (5+3*{2*{3=4}; // incorreta
        //return retorno 5+3*{2*3+4}; // incorreta
        return retorno;
    }




    public default Object pushValor (int[] pilha, int topo, int valor, int tam){
        if (topo == tam - 1){
            //return retorno (5+3*{2*(3+4)}; // correta
            //return retorno (5+3*{2*{3=4}; // incorreta
            //return retorno 5+3*{2*3+4}; // incorreta
            return retorno;
        }
        topo ++;
        pilha [topo] = valor;
        //return retorno (5+3*{2*(3+4)}; // correta
        //return retorno (5+3*{2*{3=4}; // incorreta
        //return retorno 5+3*{2*3+4}; // incorreta

        return retorno;
    }

    public default Object pushOperador (char pilha [], int topo, char valor, int tam){
        // retorno (5+3*{2*(3+4)} se R: correta se (5+3*{2*{3=4} R: incorreta ou se 5+3*{2*3+4} R: incorreta
        if (topo == tam - 1){
            //return retorno (5+3*{2*(3+4)}; // correta
            //return retorno (5+3*{2*{3=4}; // incorreta
            //return retorno 5+3*{2*3+4}; // incorreta
            return retorno;
        }
        topo ++;
        pilha [topo] = valor;
        return retorno;
        //return retorno (5+3*{2*(3+4)}; // correta
        //return retorno (5+3*{2*{3=4}; // incorreta
        //return retorno 5+3*{2*3+4}; // incorreta
    }

    public default Object popValor(int pilha [], int topo, int valor){
        if (topo == -1){
            return retorno;
            //return retorno (5+3*{2*(3+4)}; // correta
            //return retorno (5+3*{2*{3=4}; // incorreta
            //return retorno 5+3*{2*3+4}; // incorreta
        }
        valor = pilha [topo];
        topo--;
        //return retorno (5+3*{2*(3+4)}; // correta
        //return retorno (5+3*{2*{3=4}; // incorreta
        //return retorno 5+3*{2*3+4}; // incorreta
        return retorno;
    }

    public default Object popOperador (char pilha [], int topo, char valor) {
        // retorno (5+3*{2*(3+4)} se R: correta se (5+3*{2*{3=4} R: incorreta ou se 5+3*{2*3+4} R: incorreta
        if (topo == -1)
        //return retorno (5+3*{2*(3+4)}; // correta
        //return retorno (5+3*{2*{3=4}; // incorreta
        //return retorno 5+3*{2*3+4}; // incorreta

        valor = pilha [topo];
        topo--;
        return retorno;
        //return retorno (5+3*{2*(3+4)}; // correta
        //return retorno (5+3*{2*{3=4}; // incorreta
        //return retorno 5+3*{2*3+4}; // incorreta
		}

    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        float vNum; // pilha operandos
        float tam = 0;
        int topNum = -1;

        char vOperador ; // pilha de operadores
        int topOp = -1;

        int i = 0;
        String exp;
        char c;
        char opr;

        float val, op1, op2;

        System.out.println("Digite a expressão: ");
        exp = ler.nextLine();
        tam = ler.nextFloat();

        while(exp[i] != '0'){
            c = exp[i];
            switch (c){
                case '-':
                case '/':
                case '+':
                    case'*':
                        pushOperador (vOperador, topOp, c, tam);
                        break;
                case ')':
                    popValor (vNum, topNum, op2);
                    popValor (vNum, topNum, op1);
                    popOperador (vOperador, topOp, opr);
                    break;
                    switch (opr){
                        case '+': val = op1 + op2;
                        break;
                        case '*': val = op1 * op2;
                        break;
                        case '-': val = op1-op2;
                        break;
                        case '/': val = op1 / op2;
                        break;
                    }
                pushValor (vNum, topNum, val, tam);
                break;
            }
            i++;

        }
        popValor (vNum, topNum, val);
        System.out.println("Resultado: "+ val);
    }
}
