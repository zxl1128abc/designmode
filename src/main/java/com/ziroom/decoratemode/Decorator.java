package com.ziroom.decoratemode;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author zhangxiuli
 * @version 1.0
 * @date 2018/11/12 12:39
 * @since 1.0
 */
public abstract class Decorator extends Component{

    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
    @Override
    public void operation(){
        if(component != null){
            component.operation();
        }
    }
}
