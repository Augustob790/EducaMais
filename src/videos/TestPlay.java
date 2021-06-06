package videos;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import javazoom.jl.player.Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rb29
 */
public class TestPlay extends Thread{
    
    File mp3;
    Player player;
    
    public TestPlay(String caminho){
        mp3 = new File(caminho);
    }
    
    public void run(){
        FileInputStream fis;
        try{
            
            fis = new FileInputStream(mp3);
            BufferedInputStream bis = new BufferedInputStream(fis);
            Player player = new Player(bis);
            
            player.play();
            
        
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
    }
    public static void main(String ...a){
       TestPlay teste = new TestPlay("C:\\Users\\rb29\\Downloads\\PjAlfa\\PjAlfa\\src\\musica.mp3");
       teste.start();
        
    }
    
}
