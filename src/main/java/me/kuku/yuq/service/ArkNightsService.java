package me.kuku.yuq.service;

import com.IceCreamQAQ.Yu.annotation.AutoBind;
import me.kuku.yuq.entity.ArkNightsEntity;

@AutoBind
public interface ArkNightsService {
	ArkNightsEntity findByQQ(long qq);
	int delByQQ(long qq);
	void save(ArkNightsEntity arkNightsEntity);
}
