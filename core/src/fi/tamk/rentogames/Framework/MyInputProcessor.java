package fi.tamk.rentogames.Framework;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.utils.Disposable;

import fi.tamk.rentogames.Map.MapPlayer;

import static com.badlogic.gdx.Input.Keys.SPACE;

//        Insert these to the class you use this InputProcessor

//        MyInputProcessor inputProcessor = new MyInputProcessor();
//        Gdx.input.setInputProcessor(inputProcessor);

/**
 * Class to control user inputs made in game.
 *
 * @author Lauri Latva-Kyyny
 * @author  Miko Kauhanen
 * @version 1.0
 */
public class MyInputProcessor implements InputProcessor, Disposable {

    /**
     * Map screen player {@link MapPlayer} used to control inputs in map screen.
     */
    private MapPlayer player;

    /**
     * Controls the input happened in map screen.
     *
     * @param player player in map screen
     */
    public MyInputProcessor(MapPlayer player) {
        this.player = player;
    }

    public boolean keyDown (int keycode) {
        if(keycode == SPACE) {
            player.addMovementPoints();
        }

        if(keycode == Input.Keys.BACK){
            return true;
        }
        return true;
    }

    public boolean keyUp (int keycode) {
        return false;
    }

    public boolean keyTyped (char character) {
        return false;
    }

    public boolean touchDown (int x, int y, int pointer, int button) {
        return false;
    }

    public boolean touchUp (int x, int y, int pointer, int button) {
        return false;
    }

    public boolean touchDragged (int x, int y, int pointer) {
        return false;
    }

    public boolean mouseMoved (int x, int y) {
        return false;
    }

    public boolean scrolled (int amount) {
        return false;
    }

    @Override
    public void dispose() {
        player.dispose();
    }
}