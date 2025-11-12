public class Main 
{
    public static void main(String[] args) 
    {
        Playlist Playlist1 = new Playlist();
        
        Playlist1.addSong(new Song("Counting Stars", "OneRepublic", 257));
        Playlist1.addSong(new Song("Dance the Night", "Dua Lipa", 176));
        Playlist1.addSong(new Song("Life's Too Short", "Two Friends, FITZ", 212));
        Playlist1.addSong(new Song("Cinema", "Harry Styles", 243));
        Playlist1.addSong(new Song("I Ain't Worried", "OneRepublic", 149));


        System.out.println("Playlist:");
        Playlist1.displayPlaylist();

        Playlist1.removeSong("Song3");
        System.out.println("\nAfter removing Song3:");
        Playlist1.displayPlaylist();

        Song found = Playlist1.findSong("Song2");
        if(found != null) 
        {
            System.out.println("\nFound: " + found);
        } 
        else 
        {
            System.out.println("\nSong not found");
        }

        Playlist1.reversePlaylist();
        System.out.println("\nReversed Playlist:");
        Playlist1.displayPlaylist();

        Playlist1.shufflePlaylist();
        System.out.println("\nShuffled Playlist:");
        Playlist1.displayPlaylist();
    }
}
