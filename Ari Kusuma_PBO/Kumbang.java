import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kumbang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kumbang extends Actor
{
    /**
     * Act - do whatever the Kumbang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public Kumbang(){
        setRotation(180);
    }
    public Kumbang(int speed){
        setRotation(180);
        this.speed = speed;
    }
    
    public int speed = 1;
    public void act()
    {
        move(speed);

        World w = getWorld();
        if(isAtEdge())
        {
            setLocation(590,getY());
        }
    }
    public void hilang ()
    {
        if (isAtEdge())
            getWorld().removeObject(this);
    }
}
