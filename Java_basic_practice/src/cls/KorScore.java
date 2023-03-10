package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 5명의 학생의 국어점수를 보관하고 처리할 클래스
@Setter
@Getter
@ToString
public class KorScore {
	
	private String[] student = new String[5];
	private int[] score = new int[5];

	// 학생들의 점수 합계를 구해주는 메소드
	public int sumScore() {
		int sum = 0;
		int i;
		for (i = 0; i < score.length; i++) { // 0 1 2 3 4
			sum = sum + this.score[i];
		}
		return sum;
	}

	public float avgScore() {
		float avg = 0.0f;
		float sum = this.sumScore();
		avg = sum / (float) this.score.length; // 실수 한개이상 필요
		return avg;
	}

	public int Score90() {
		int ctl = 0;
		int i = 0;
		for (i = 0; i < this.score.length; i++) {
			if (this.score[i] >= 90) {
				ctl = ctl + 1;
			}
		}
		return ctl;

	}

	public int scoreMax() {
		int i;
		int max = this.score[0]; // 맨 앞의 값인 20이 들어가게 됨.
		for (i = 0; i < this.score.length; i++) {
			if (max < this.score[i]) {
				max = this.score[i];
			}
		}
		return max;
	}

	public int scoreMin() {
		int i;
		int min = this.score[0]; // 맨 앞의 값인 20이 들어가게 됨.
		for (i = 0; i < this.score.length; i++) {
			if (min > this.score[i]) {
				min = this.score[i];
			}
		}
		return min;
		// setter, getter, toString 메소드가 존재함
	}
}
