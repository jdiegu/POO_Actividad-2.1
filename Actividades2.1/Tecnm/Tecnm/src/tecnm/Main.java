package tecnm;

public class Main {
    public static void main(String arg[]) {
        //para acceder a los metodos: creaCampus, menuOpciones
        Tecnm tecnm= new Tecnm();
        
        //Cuado se crea el campus se escribe el nombre del campus y el numero de carreras que ofrece
        Campus tec=tecnm.creaCampus("Orizaba", 9);
        
        //Se invoca al menu de opciones pasando como parametro del campus creado
        tecnm.menuOpciones(tec);
    }
}
