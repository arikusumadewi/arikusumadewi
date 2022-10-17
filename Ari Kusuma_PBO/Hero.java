import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveHero();
        shootLaser();
    }
    
    public void moveHero()
    {
        if (Greenfoot.isKeyDown("W"))
            setLocation(getX(), getY()-3);
        if (Greenfoot.isKeyDown("S"))
            setLocation(getX(), getY()+3);
        
        if (Greenfoot.isKeyDown("A"))  
            setLocation(getX()-3, getY());
        if (Greenfoot.isKeyDown("D"))
            setLocation(getX()+3, getY()+3);
            
    }
    
    int laserTimer = 0;
    public void shootLaser(){
        if (laserTimer == 30){
            getWorld().addObject(
                new Laser(),
                getX() + 5,
                getY()
            );
            
            laserTimer =  0;
        }else{
            laserTimer++;
        }
    }
    public void detectKumbangCollision()
    {
        if (isTouching(Kumbang.class)) 
        {
            kumbangCollision();
            setLocation(100,200);
        }
    }
    public void kumbangCollision(){
        if (isTouching(Kumbang.class)){
            getWorld().addObject(
            new Boom(),
            getX(),
            getY()
            );
        }
    }
}
