public class HWProgram23 {

    public static void main(String[] args){
        MusicStyles[] musicStyles ={new PopMusic(),new RockMusic(),new ClassicMusic()};

        for (MusicStyles style: musicStyles){
            style.playMusic();
        }


    }
}
