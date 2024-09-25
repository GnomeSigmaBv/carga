package calendario;

public class CALENDARIO {

    public static void main(String[] args) {

        VENTA inicio = new VENTA();
        inicio.setTitle("Bv");
        inicio.setBounds(400, 100, 600, 300);
        inicio.setResizable(false);
        inicio.insertarPanel();
        inicio.LetrasGuias();
        inicio.EspaciosBlancos();
    }

}
