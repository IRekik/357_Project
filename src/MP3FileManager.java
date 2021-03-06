import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MP3FileManager {
    public Map<String, File> audioMap;
    
    //Create file variables
    File A_File;
    File As_File;
    File B_File;
    File C_File;
    File Cs_ile;
    File D_File;
    File Ds_File;
    File E_File;
    File F_File;
    File Fs_File;
    File G_File;
    File Gs_File;
    
    //Initializing them to the mp3 samples
    public MP3FileManager() {
        File A_File = new File("resources/A.mp3");
        File As_File = new File("resources/A#.mp3");
        File B_File = new File("resources/B.mp3");
        File C_File = new File("resources/C.mp3");
        File Cs_ile = new File("resources/C#.mp3");
        File D_File = new File("resources/D.mp3");
        File Ds_File = new File("resources/D#.mp3");
        File E_File = new File("resources/E.mp3");
        File F_File = new File("resources/F.mp3");
        File Fs_File = new File("resources/F#.mp3");
        File G_File = new File("resources/G.mp3");
        File Gs_File = new File("resources/G#.mp3");
        
        //Making a hash map and linking each file to a note name. The A file makes the A note sound
        audioMap = new HashMap();
        audioMap.put("A", A_File);
        audioMap.put("A#", As_File);
        audioMap.put("B", B_File);
        audioMap.put("C", C_File);
        audioMap.put("C#", Cs_ile);
        audioMap.put("D", D_File);
        audioMap.put("D#", Ds_File);
        audioMap.put("E", E_File);
        audioMap.put("F", F_File);
        audioMap.put("F#", Fs_File);
        audioMap.put("G", G_File);
        audioMap.put("G#", Gs_File);
    }
    //As the method name suggests, we generate a random sound from the sample
    public File getRandomNote() {
        File ret;
        Random rand = new Random();
        int random = rand.nextInt(12);
        switch (random) {
            case 0:
                ret = audioMap.get("A");
                break;
            case 1:
                ret = audioMap.get("A#");
                break;
            case 2:
                ret = audioMap.get("B");
                break;
            case 3:
                ret = audioMap.get("C");
                break;
            case 4:
                ret = audioMap.get("C#");
                break;
            case 5:
                ret = audioMap.get("D");
                break;
            case 6:
                ret = audioMap.get("D#");
                break;
            case 7:
                ret = audioMap.get("E");
                break;
            case 8:
                ret = audioMap.get("F");
                break;
            case 9:
                ret = audioMap.get("F#");
                break;
            case 10:
                ret = audioMap.get("G");
                break;
            case 11:
                ret = audioMap.get("G#");
                break;
            default:
                ret = null;
        }
        return ret;
    }
}
