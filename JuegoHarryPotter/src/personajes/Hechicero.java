package personajes;

import hechizos.UseMagic;


public abstract class Hechicero {
    public UseMagic useMagic;

    public Hechicero(){};

    public abstract void display();

    public void lanzarHechizo(){
        useMagic.useMagic();    
    }
}
