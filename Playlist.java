public class Playlist 
{
    Node head;
    public Playlist() 
    {
        head = null;
    }
    public void addSong(Song song) 
    {
        Node newNode = new Node(song);
        if(head == null) 
        {
            head = newNode;
        } 
        else 
        {
            Node current = head;
            while(current.next != null) 
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void removeSong(String title) 
    {
        if(head == null) 
        {
            return;
        }
        if(head.info.title.equals(title)) 
        {
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null) 
        {
            if(current.next.info.title.equals(title)) 
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public void displayPlaylist() 
    {
        if(head == null) 
        {
            System.out.println("Playlist is empty.");
            return;
        }
        Node current = head;
        while(current != null) 
        {
            System.out.println(current.info);
            current = current.next;
        }
    }
    public Song findSong(String title) 
    {
        Node current = head;
        while(current != null) 
        {
            if(current.info.title.equals(title)) 
            {
                return current.info;
            }
            current = current.next;
        }
        return null;
    }
    // reversing the playlist
    public void reversePlaylist() 
    {
        Node lastSong = null;
        Node currentSong = head;
        Node nextSong = null;
        while(currentSong != null) 
        {
            nextSong = currentSong.next;
            currentSong.next = lastSong;
            lastSong = currentSong;
            currentSong = nextSong;
        }
        head = lastSong;
    }
    public void shufflePlaylist() 
    {
        if(head == null || head.next == null) 
        {
            return;
        }
        int count = 0;
        Node current = head;
        while(current != null) 
        {
            count++;
            current = current.next;
        }
        for(int i = 0; i < count; i++) 
        {
            int index1 = (int)(Math.random() * count);
            int index2 = (int)(Math.random() * count);
            Node node1 = head;
            Node node2 = head;
            for(int j = 0; j < index1; j++) 
            {
                node1 = node1.next;
            }
            for(int j = 0; j < index2; j++) 
            {
                node2 = node2.next;
            }

            Song temp = node1.info;
            node1.info = node2.info;
            node2.info = temp;
        }
    }
}
