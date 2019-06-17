package pl.edu.pjatk.tau.service;

import pl.edu.pjatk.tau.domain.Order;
import pl.edu.pjatk.tau.domain.RubberBand;
import pl.edu.pjatk.tau.domain.User;

import java.util.List;

public interface RestControllerService {
    Long addBand(RubberBand rubberBand);
    List<RubberBand> findAllRubberBands();
    RubberBand findRubberBandById(Long id);
    void deleteRubberBand(RubberBand rubberBand);
    void updateRubberBand(RubberBand rubberBand);

    Long addUser(User user);
    User findUserById(Long id);
    void deleteUser(User user);
    void updateUser(User user);

    Long addOrder(Order order);




}
