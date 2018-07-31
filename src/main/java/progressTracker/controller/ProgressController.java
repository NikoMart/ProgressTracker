package progressTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import progressTracker.Repository.ProgressRepository;
import progressTracker.model.ProgressUnit;

@Controller
@RequestMapping(path = "/progress")
public class ProgressController {
    @Autowired
    private ProgressRepository progressRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewProgressUnit(@RequestParam String name, @RequestParam String description, @RequestParam Integer initialValue) {
        ProgressUnit unit = new ProgressUnit();
        unit.setName(name);
        unit.setDescription(description);
        unit.setProgressValue(initialValue);
        progressRepository.save(unit);
        return "Saved";
    }

    @RequestMapping(path = "/units", method = RequestMethod.GET)
    public String getAllProgressUnits(Model model) {
        model.addAttribute("units", progressRepository.findAll());
        return "ProgressUnitsList";
    }


}
