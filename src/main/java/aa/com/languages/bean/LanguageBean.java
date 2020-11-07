package aa.com.languages.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import aa.com.languages.Language;

@Named
@RequestScoped
public class LanguageBean {

	public void translate(Language from, Language to) {

	}

}
