package com.bdqn.qqmusic.service;

import java.util.List;

import com.bdqn.qqmusic.pojo.Artist;

public interface INationService {
	//�Թ���ID���Ҹ���
	public List<Artist> findByNID(Integer nid);
}
