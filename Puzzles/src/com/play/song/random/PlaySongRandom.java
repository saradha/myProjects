package com.play.song.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlaySongRandom {

	/*public static void main(String[] args) {
		
		 * Object[] arr = new Object[5]; for (int i = 0; i <= 4; i++) { arr[i] =
		 * i; }
		 
		List<Songs> list = new ArrayList<Songs>();
		for (int i = 0; i <= 4; i++) {
			Songs s = new Songs();
			s.setSongId("song " + i);
			list.add(s);
		}

		pickSongRandomAndPlay(list);

	}

	private static void pickSongRandomAndPlay(List<Songs> list) {
		Object[] arr=list.toArray();
		while(list.size()>0){
		Collections.shuffle(list);
		List<Songs> newList = new ArrayList<Songs>();
		for (int i = 0; i <= 4; i++) {
			Songs song = list.get(i);
			System.out.println("playing song " + song.getSongId());
			list.remove(song);
			newList.add(song);
		}
		list.addAll(newList);
		}
		int j=5;
		Random r = new Random();
		while (list.size() > 0) {
			Songs song =null;
			for (int i = 0; i < list.size(); i++) {
				 song = list.get(r.nextInt(list.size())); 
			
			System.out.println("playing song " + song.getSongId());
			list.remove(song); // the forgotten step
			if (newList.size() <=j) {
				newList.add(song);
				
				j--;
			}
			if (list.isEmpty()) {
				list.addAll(newList);
			}
			}
		}

	}

	private static int nextInt(int size) {
		Random r = new Random();
		int n = 0;
		for (int i = 0; i < size; i++) {
			n = r.nextInt(size);
		}
		return n;
	}*/
	
	
	  public static void shuffleArray(String[] a) {
          int n = a.length;
          Random random = new Random();
          random.nextInt();
          for (int i = 0; i < n; i++) {
                  int change = i + random.nextInt(n - i);
                  swap(a, i, change);
          }
  }

  private static void swap(String[] a, int i, int change) {
	     String helper = a[i];
          a[i] = a[change];
          a[change] = helper;
  }

  public static void main(String[] args) {
	  List<String>list= new ArrayList<String>();
	  String[] a = new String[] {"song1","song2","song3"};
          while(true){
          shuffleArray(a);
          for (String i : a) {
                  System.out.println(i);
                  list.add(i);
          }
          }
  }
}