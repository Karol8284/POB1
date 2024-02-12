import java.lang.reflect.Array;

public class KonwerterPogody {
    char[] tab;
    KonwerterPogody(){
        this.tab = new char[]{'C', 'F', 'K'};
    }
    public float konwertuj(float f,char from,char to){
        switch (from){
            case 'C':
                switch (to){
                    case 'F':
                        return (float) (f * 1.8 + 32);
                    case 'K' :
                        return (float) (f + 273.15);
                }
            break;
            case 'F':
                switch (to){
                    case 'C':
                        return (float) ((f - 32) / 1.8 );
                    case 'K':
                        return (float) (f * 495.67 * 5/9);
                }

                break;
            case 'K':
                switch (to){
                    case 'C':
                        return (float) (f - 273.15);
                    case 'F' :
                        return (float) (f * 1.8 - 495.67);
                }
                break;
        }

        return 0;
    }

    public static void main(String[] args) {
        KonwerterPogody k = new KonwerterPogody();
        System.out.println(k.konwertuj(62,'C','F'));
    }
}
