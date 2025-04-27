public class Fila {

    private static Fila instancia;

   private Fila(){
       System.out.println("Fila de impressão iniciada");
   }

    public static Fila getInstancia() {

       if (instancia == null) {
           instancia = new Fila();
       }

        return instancia;
    }

    public void imprimeDocumento(){
        System.out.println("Imprimindo documento!");
   }

   public void removeDocumento(){
       System.out.println("Removido documento!");
   }

   public void removeTodosDocumentos(){
       System.out.println("Removido todos os documentos!");
   }

}
