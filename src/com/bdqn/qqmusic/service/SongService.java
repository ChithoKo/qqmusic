package com.bdqn.qqmusic.service;

import java.util.List;

import com.bdqn.qqmusic.pojo.Artist;
import com.bdqn.qqmusic.pojo.Record;
import com.bdqn.qqmusic.pojo.Song;

public interface SongService {

	//Song song = null;
	
	//ͨ����������song����
    List<Song> getSongByName(Object name);
    Song getSongById(int id);
    List<Song> getAllSongs();

    //�����Ƿ�ҳ
    //pageNum ��ǰ����ҳ;  line һҳ�ж�����Songs
    List<Song> getAllSongsByPageNum(int pageNum, int line);
    List<Song> getSongsByRecord(Record record);
    List<Song> getSongsByRecordPageNum(Record record, int pageNum);
    List<Song> getSongsByRecordPageNum(Record record, int pageNum, int line);
    List<Song> getSongsByArtist(Artist artist);
    List<Song> getSongsByArtistPageNum(Artist artist, int pageNum);

    //��ɾ��
    void addSong(Song song);
    void deleteSong(Song Song);
    void editSong(Song song);
}
