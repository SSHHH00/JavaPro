package zhome;

public class CCCAACCUULL {

	public static void main(String[] args) {
		Calc calc = new Calc();
        calc.btnExec.btnExec_click();
    }
}

class Calc {
    Button btnExec;

    public Calc() {
        init();
    }

    private void init() {
        this.btnExec = new Button("[ = ]", this);
    }

    public void execDisp(String result) {
        System.out.printf("[화면결과 출력] %s\n", result);
    }
}

class Button {
    String text;
    Calc calc;

    public Button() { }

    public Button(String text) {
        this.text = text;
    }

    public Button(String text, Calc calc) { 
        this(text);
        this.calc = calc;
    }

    public void btnExec_click() {
        String result = "3 + 5 = 8";
        this.calc.execDisp(result);
    }
}