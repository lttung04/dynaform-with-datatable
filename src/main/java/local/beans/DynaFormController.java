package local.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.extensions.model.dynaform.DynaFormModel;
import org.primefaces.extensions.model.dynaform.DynaFormRow;

@ManagedBean
@ViewScoped
public class DynaFormController implements Serializable {

	private static final long serialVersionUID = 1L;
	private DynaFormModel model;
	private List<String> documents;

	public DynaFormController() {
		model = new DynaFormModel();
		documents = new ArrayList<>();
		documents.add("First doc");
		DynaFormRow row = model.createRegularRow();
		// row.addLabel("row 1");
		row.addControl(row, "FileUpload");
	}

	public DynaFormModel getModel() {
		return model;
	}

	public void setModel(DynaFormModel model) {
		this.model = model;
	}

	public List<String> getDocuments() {
		return documents;
	}

	public void setDocuments(List<String> documents) {
		this.documents = documents;
	}

}
