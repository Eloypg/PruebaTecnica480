import java.util.Arrays;

public class Disco {
    public String name;
    public float capacity;
    public String[] dataArray = new String[100];
    public String diskType;

    public static final String DEFAULT_NAME = "diskName";
    public static final float DEFAULT_CAPACITY = 0;
    public static final String DEFAULT_TIPE = "disk";


    public String getDiskType() {
        return diskType;
    }
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
    public void setName(String name) {
        this.name = name;
    }
        public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Disco{\n" +
                "name= " + name + "\n" +
                "capacity= " + capacity + "\n" +
                "diskContent= " + Arrays.toString(dataArray) + "\n" +
                "diskType= " + diskType + "\n" +
                '}';
    }

    public Disco(){
        this.name = DEFAULT_NAME;
        this.capacity = DEFAULT_CAPACITY;
        this.diskType = DEFAULT_TIPE;
    }
    public Disco(String name, float capacity, String diskType){
        this.name = name;
        this.capacity = capacity;
        this.diskType = diskType;
    }

    public String spin(){
        return ("Disco girando...");
    }
    int positionData = 0;
    public int saveData(String data){
        dataArray[positionData] = data;
        return positionData++;
    }
    public String writeData(String diskType){
        diskType.toUpperCase();
        if(diskType.equals("CD")){
            return ("Escribiendo datos por láser.");
        } else if (diskType.equals("DISCO DURO")) {
            return("Esctibiendo datos por cabezal magnético.");
        }
        return null;
    }
    public String readData(String diskType){
        diskType.toUpperCase();
        if(diskType.equals("CD")){
            return ("Leyendo datos por láser.");
        } else if (diskType.equals("DISCO DURO")) {
            return ("Leyendo datos por cabezal magnético.");
        }
        return null;
    }
}