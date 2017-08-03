package com.houie.gkg.controller;

import com.houie.gkg.dto.SelectionDto;
import com.houie.gkg.lang.Game;
import com.houie.gkg.lang.Selection;
import com.houie.gkg.service.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by houie on 8/1/2017.
 */
@Controller
public class MainController {

    @Autowired
    private GameService gameService;

    @RequestMapping(value = {"", "/"})
    public ModelAndView getMain(ModelMap model, HttpSession session) {
        return new ModelAndView("main", model);
    }

    @RequestMapping(value = {"/teams"}, method = RequestMethod.GET)
    public ModelAndView getTeams(ModelMap model) {
        model.put("teams", gameService.getTeams());
        return new ModelAndView("jsonView", model);
    }

    @RequestMapping(value = {"/teams/{abbreviation}"}, method = RequestMethod.GET)
    public ModelAndView getTeam(@PathVariable String abbreviation, ModelMap model) {
        model.put("team", gameService.getTeam(abbreviation));
        return new ModelAndView("jsonView", model);
    }

    @RequestMapping(value = {"/games"}, method = RequestMethod.GET)
    @ResponseBody
    public List<Game> getGames() {
        return gameService.getGames();
    }

    @RequestMapping(value = {"/games/{id}"}, method = RequestMethod.GET)
    @ResponseBody
    public Game getGameById(@PathVariable int id) {
        return gameService.getGame(id);
    }

    @RequestMapping(value = {"/selections"}, method = RequestMethod.GET)
    @ResponseBody
    public List<SelectionDto> getSelections(ModelMap model, HttpSession session) {
        return convertToDtos(gameService.getSelections());
    }

    @RequestMapping(value = {"/selections"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public SelectionDto addSelection(@RequestBody SelectionDto selectionDto) {
        Selection selection = convertToEntity(selectionDto);
        Selection selectionCreated = gameService.createSelection(selection);
        return convertToDto(selectionCreated);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    private ModelMapper modelMapper = new ModelMapper();

    private Selection convertToEntity(SelectionDto selectionDto) {
        Selection selection = modelMapper.map(selectionDto, Selection.class);
        return selection;
    }

    private SelectionDto convertToDto(Selection selection) {
        SelectionDto selectionDto = modelMapper.map(selection, SelectionDto.class);
        Game game = gameService.getGame(selection.getGameId());
        selectionDto.setTeam(game.getOpponent());
        return selectionDto;
    }

    private List<SelectionDto> convertToDtos(List<Selection> selections) {
        List<SelectionDto> selectionDtos = new ArrayList<SelectionDto>();
        for (Selection s : selections) {
            selectionDtos.add(convertToDto(s));
        }
        return selectionDtos;
    }
}
