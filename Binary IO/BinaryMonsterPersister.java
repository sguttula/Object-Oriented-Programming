package lab4;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import lab4.AttackMonitor;
import lab4.MonsterAttack;
import lab4.MonsterAttackDriver;
import lab4.MonsterPersister;
@SuppressWarnings("serial")
public class BinaryMonsterPersister implements MonsterPersister {
	@Override
	public void saveThisListToBinaryFile(File file, List<MonsterAttack> monsterAttacks) {
		ObjectOutputStream out = null;
		FileOutputStream in = null;
		try {
			out= new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(file)));
 
		
			out.writeObject(monsterAttacks);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<MonsterAttack> readThisListFromBinaryFile(File file) {
		ObjectInputStream obj2 = null;
		List<MonsterAttack> mp2 = null;
		try {
			obj2 = new ObjectInputStream(new BufferedInputStream(
					new FileInputStream(file)));

			mp2 = (List<MonsterAttack>) obj2.readObject();
			obj2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mp2;
	}
}
