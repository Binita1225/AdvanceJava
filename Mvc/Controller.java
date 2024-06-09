package Mvc;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        // Manually link the button click to the controller logic
        view.getIncrementButton().addActionListener(e -> {
            model.incrementCounter(); // Update the model
            view.setCounter(model.getCounter()); // Update the view
        });
        view.getIncrementButton().addActionListener(e -> {
            model.incrementCounter(); // Update the model
            view.setCounter(model.getCounter()); // Update the view
        });
    }
}

