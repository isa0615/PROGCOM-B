public class CasaRufito extends Casa {

    private String colorTecho;
    private String colorPuerta;
    private String decoraciones;
    private String materialConstruccion;

    private int cantidadFloresDibujadas;
    private boolean tieneSol;
    private boolean tieneCorazones;
    private boolean tienePastoDibujado;

    public CasaRufito() {
        super("Blanco", 1, 1, true, false);

        this.colorTecho = "Verde y rosado (decorado en patrón)";
        this.colorPuerta = "Verde";
        this.decoraciones = "Flores coloridas a los lados, corazones rosados y un sol amarillo brillante";
        this.materialConstruccion = "Cartulina blanca pintada y decorada a mano";

        this.cantidadFloresDibujadas = 12; // muchas flores alrededor
        this.tieneSol = true;
        this.tieneCorazones = true;
        this.tienePastoDibujado = true;
    }

    @Override
    public String describir() {
        String desc = "--- Descripción de la Casa Rufito ---\n\n";
        desc += "Estructura: Hecha en " + this.materialConstruccion + ".\n";
        desc += "Techo: " + this.colorTecho + ".\n\n";

        desc += "--- Colores ---\n";
        desc += "* Fachada principal: " + this.colorPrincipal + ".\n";
        desc += "* Puerta: " + this.colorPuerta + ".\n";
        desc += "* Ventanas: Decoradas con colores vivos y detalles en marcador.\n\n";

        desc += "--- Decoraciones ---\n";
        desc += "* " + this.decoraciones + ".\n";
        desc += "* Tiene aproximadamente " + this.cantidadFloresDibujadas + " flores dibujadas por los lados.\n";
        desc += "* ¿Tiene sol?: " + (this.tieneSol ? "Sí ☀️" : "No") + ".\n";
        desc += "* ¿Tiene corazones?: " + (this.tieneCorazones ? "Sí 💖" : "No") + ".\n";
        desc += "* ¿Tiene pasto dibujado?: " + (this.tienePastoDibujado ? "Sí 🌿" : "No") + ".\n\n";

        return desc;
    }

    @Override
    public void pintar(String nuevoColor) {
        super.pintar(nuevoColor);
        this.colorPrincipal = nuevoColor;
        System.out.println("La fachada de la Casa Rufito ha sido pintada de color " + nuevoColor + ".");
    }

    public void pintarPuerta(String nuevoColor) {
        this.colorPuerta = nuevoColor;
        System.out.println("La puerta de la Casa Rufito ha sido pintada de color " + nuevoColor + ".");
    }

    public void pintarTecho(String nuevoColor) {
        this.colorTecho = "Techo pintado de " + nuevoColor;
        System.out.println("El techo de la Casa Rufito ha sido pintado de color " + nuevoColor + ".");
    }
}
