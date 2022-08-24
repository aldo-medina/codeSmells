public class Piloto {

    public void volarVehiculo(VehiculoVolador i) {
        // ...
        //Código
        // ...
        
        if (i.getClass().equals(Helicoptero.class)) {

            Helicoptero helicoptero = (Helicoptero) i;
            helicoptero.volar();

        } else {

            Avion avion = (Avion) i;
            if (avion.esHidroavion()) {
                avion.rodarEnAgua();
                avion.despegar();
            } else {
                avion.rodarEnPista();
                avion.despegar();
            }

        }
        
        // ...
        //Más código
        // ...
        
    }

}
