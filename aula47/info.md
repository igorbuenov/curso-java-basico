### Tratamentos de exceções Java

- Palavras-chave desse módulo
  - try
  - catch
  - throw
  - throws
  - finally

- Não tratar erros fazem a execução do programa terminar.
- Tratar erros:
  - Permitem que o programa execute uma determinada lógica caso o erro ocorra
  - Permitem que o programa continue a execução

### try - catch
 
    try {
            // bloco que é monitorado para erros
    } catch (TipoDaException exception) {
            // tratamento do erro
    }
### Exemplos:

- Simples

    try {

            int[] vetor = new int[4];

            System.out.println ("Antes da exception");

            vetor[4] = 1;

            System.out.println ("Esse texto não será impresso!");

        } catch (ArrayIndexOutOfBoundsException exception) {

            System.out.println ("Exceção ao acessar um índice do que não existe no vetor");

        }

        System.out.println ("Esse texto será impresso após a exception");

- Multiplos 

       int[] numeros = {4,8,16,32,64,128};
       int[] denominadores = {2,0,4,8,0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println (numeros[i] + " / " + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            catch (ArithmeticException exception) {
                System.out.println ("Erro ao dividir por zero");
            }
            catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println ("Posição do array inválida");
            }
        }
- Multiplos genéricos

      for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println (numeros[i] + " / " + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            catch (ArithmeticException exception) {
                System.out.println ("Erro ao dividir por zero");
            }
            catch (Throwable exception) {
                System.out.println ("Ocorreu um erro");
            }
        }

### finally

    try {
        // bloco que é monitorado para erros
    }
    catch(TipoDaException1 exception) {
        // tratamnto do erro 1
    }
    catch(TipoDaException2 exception) {
        // tratamnto do erro 2
    }
    finally {
        // executado após o try ou catch
    }