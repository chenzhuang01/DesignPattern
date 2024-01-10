package TemplatePattern.template;

/**
 * @author cz
 * @Date 2024/1/8 11:04
 */
public abstract class Game {
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();

    //模板
    public final void play(){
        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
