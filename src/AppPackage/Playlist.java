/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

/**
 *
 * @author Jim
 */
import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileOutputStream;
    import java.io.ObjectInputStream;
    import java.io.ObjectOutputStream;
    import java.util.ArrayList;
    import java.util.Arrays;
import javax.swing.JDialog;
    import javax.swing.JFileChooser;
    import javax.swing.JFrame;
/**
 *
 * @author ROTAN27
 */
public class Playlist {
    JFileChooser fc = new JFileChooser();
    
    
    ArrayList ls = new ArrayList();
    
    void add(JDialog frame){
        fc.setMultiSelectionEnabled(true);
        int fileValid = fc.showOpenDialog(frame);
        if (fileValid == fc.CANCEL_OPTION){
            return;
        } else if (fileValid == fc.APPROVE_OPTION){
            File[] file = fc.getSelectedFiles();
            ls.addAll(Arrays.asList(file));
        }
    }
    
    ArrayList getListSong(){
        return ls;
    }
   
    
    
    //save playlist
    
    

}