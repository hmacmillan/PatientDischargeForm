package uk.nhs.scot.tayside.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="localDateConverter")
public class LocalDateConverter implements Converter {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        LocalDate date = LocalDate.parse(value, formatter);
        return date;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        LocalDate date = (LocalDate)value;
        return date.format(formatter);
    }
}
