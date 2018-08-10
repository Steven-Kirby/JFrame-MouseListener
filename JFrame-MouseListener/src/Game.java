public class Game implements Runnable {

	private MouseManager mouseManager;
	
	private Window window;
	Game(Window window){
		this.setWindow(window);
		
		init();
	}
	
	private void init() {
		mouseManager = new MouseManager();
		window.getCanvas().addMouseListener(mouseManager);
		window.getCanvas().addMouseMotionListener(mouseManager);
		window.getCanvas().addMouseWheelListener(mouseManager);
	}

	public Window getWindow() {
		return window;
	}
	
	public void setWindow(Window window) {
		this.window = window;
	}

	@Override
	public void run() {
		
	}
}
