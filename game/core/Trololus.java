package game.core;

import org.newdawn.slick.*;

public class Trololus extends BasicGame {

	static boolean fullscreen = true;
	static boolean ShowFPS = true;
	public Image background;
	static int fpslimit = 60;
	static String title = "Trololus NightBuild.0";
	static int width = 1680;
	static int height = 1050;
	
	public Trololus(String title)	{super(title);
	}

	
	@Override
	public void init(GameContainer gc) throws SlickException{
		background = new Image("src/resources/background.png");
		
	} 
	
	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		
	}
	
	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		background.draw(100,100,1);
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new Trololus(title));
		app.setDisplayMode(width, height, fullscreen);
		app.setSmoothDeltas(true);
		app.setTargetFrameRate(fpslimit);
		app.start();
		System.out.println("pepa");

	}
}

