package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.NamedEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by ilmir on 02.06.16.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Team extends NamedEntity {

  private String description;
  private Image image;
  private List<Player> players;
  private Stadium stadium;
  private String site;
  private Manager manager;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @ManyToOne(cascade = CascadeType.ALL)
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }

  @ManyToOne(cascade = CascadeType.ALL)
  public Stadium getStadium() {
    return stadium;
  }

  public void setStadium(Stadium stadium) {
    this.stadium = stadium;
  }

  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  @ManyToOne(cascade = CascadeType.ALL)
  public Manager getManager() {
    return manager;
  }

  public void setManager(Manager manager) {
    this.manager = manager;
  }
}
