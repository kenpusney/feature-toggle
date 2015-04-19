package net.kimleo.hjk.helper;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class FeatureToggleTag extends SimpleTagSupport {
    private String name;

    @Override
    public void doTag() throws JspException, IOException {
        if(FeatureToggle.instance().isEnabled(name)){
            getJspBody().invoke(getJspContext().getOut());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
