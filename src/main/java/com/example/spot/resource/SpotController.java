package com.example.spot.resource;

import com.example.spot.dto.SpotDTO;
import com.example.spot.service.SpotService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.reactivex.Single;

import javax.inject.Inject;
import java.util.List;

@Controller("/api/spot")
public class SpotController {

    @Inject
    private SpotService spotService;

    @Put
    Single<HttpResponse<SpotDTO>> createSpot(@Body Single<SpotDTO> spot) {
        return Single.just(HttpResponse.status(HttpStatus.NOT_IMPLEMENTED));
    }

    @Post("/{id}")
    Single<HttpResponse<SpotDTO>> updateSpot(@PathVariable("id") String id, @Body Single<SpotDTO> spot) {
        return Single.just(HttpResponse.status(HttpStatus.NOT_IMPLEMENTED));
    }

    @Delete("/{id}")
    Single<HttpResponse<Void>> deleteSpot(@PathVariable("id") String id) {
        return Single.just(HttpResponse.status(HttpStatus.NOT_IMPLEMENTED));
    }

    @Get("/{id}")
    Single<HttpResponse<SpotDTO>> findById(@PathVariable("id") String id) {
        return Single.just(HttpResponse.status(HttpStatus.NOT_IMPLEMENTED));
    }

    @Get("/")
    Single<HttpResponse<List<SpotDTO>>> listSpots() {
        return Single.just(HttpResponse.status(HttpStatus.NOT_IMPLEMENTED));
    }
}
