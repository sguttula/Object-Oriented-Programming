package lab4;

import java.io.File;
import java.util.List;

import lab4.AttackMonitor;
import lab4.MonsterAttack;
import lab4.MonsterAttackDriver;
import lab4.BinaryMonsterPersister;

public interface MonsterPersister {

	public void saveThisListToBinaryFile(File f, List<MonsterAttack> l);
	public List<MonsterAttack> readThisListFromBinaryFile(File f);
	
   	
}
