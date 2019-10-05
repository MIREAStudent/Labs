//your_package

import java.util.ArrayList;
import java.util.List;

public class Song {

    private String name ;
    private String author;
    private Song prev;


    public Song(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String title(){
        return name + " " + author;
    }
    @Override
    public boolean equals(Object song){
        if(song instanceof Song){
            Song newSong = (Song) song;
            if(this.author.equals(newSong.author) &&(this.name.equals(newSong.name)))
                return true;
            else
                return false;

        }else{
            return false;
        }



    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Song getPrev() {
        return prev;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrev(Song prev) {
        this.prev = prev;
    }


    public static void main(String[] args) {

        Song song = new Song("Дежавю", "Kizaru");
        Song song2 = new Song("Дежавю", "Kizaru");
        Song song3 = new Song("ВЫХОДИ", "Лицо");
        Song song4 = new Song("Остров в океане", "Пророк Сан-бой");

        List<Song> list = new ArrayList<Song>();

        list.add(song);
        list.add(song2);
        list.add(song3);
        list.add(song4);

        Song prev = song;

        for(Song s : list){
            System.out.println(s.title());
            if(s!= list.get(0)) {
                s.prev = prev;
                prev = s;
            }
        }

        for(Song s : list){
            if(s.getPrev()!=null)
            System.out.println(s.getPrev().title());

        }

        System.out.println(song.equals(song2));
        song2 = song4;
        System.out.println(song.equals(song2));



    }


}

