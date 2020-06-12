package lab4;
import lab4.MonsterPersister;

import java.io.IOException;
import java.io.Serializable;

import lab4.BinaryMonsterPersister;
public class MonsterAttackDriver implements Serializable{
	public static void main(String[] args) throws IOException {
		AttackMonitor numberAttack = new AttackMonitor();
		numberAttack.monitor(); 
	}
}
