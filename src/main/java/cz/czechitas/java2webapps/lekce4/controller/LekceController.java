package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * Kontroler obsluhující sekci lekcí.
 */
@Controller()
@RequestMapping("/lekce")
public class LekceController {
    private final List<Lekce> lekce;

    public LekceController() {
        lekce = List.of(
                new Lekce("Lekce 1", LocalDate.of(2021, 4, 21), LocalTime.of(18, 00), LocalTime.of(20, 00), "V mechu"),
                new Lekce("Lekce 2", LocalDate.of(2021, 4, 28), LocalTime.of(18, 00), LocalTime.of(20, 00), "V mechu"),
                new Lekce("Lekce 3", LocalDate.of(2021, 5, 5), LocalTime.of(18, 00), LocalTime.of(20, 00), null)
        );
    }

    /**
     * Metoda kontroleru obsluhující adresu {@code /lekce/}. Používá šablonu {@code /templates/lekce/index.html}.
     *
     * @return
     */
    @GetMapping("/")
    public ModelAndView lekce() {
        ModelAndView modelAndView = new ModelAndView("lekce/index");
        modelAndView.addObject("lekce", lekce);
        return modelAndView;
    }
}
