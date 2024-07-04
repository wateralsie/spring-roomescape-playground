package roomescape.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import roomescape.model.Reservation;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ReservationController {

    private List<Reservation> reservations = new ArrayList<>(
            Arrays.asList(
                    new Reservation(1, "배수민", LocalDate.now().toString(), LocalTime.now().toString()),
                    new Reservation(2, "배수민", LocalDate.now().toString(), LocalTime.now().toString()),
                    new Reservation(3, "배수민", LocalDate.now().toString(), LocalTime.now().toString())
            )
    );

    @GetMapping("/reservation")
    public String reservation() {
        return "reservation";
    }

    @GetMapping("/reservations")
    public ResponseEntity<List<Reservation>> getReservations() {
        return ResponseEntity.ok().body(reservations);
    }

}
