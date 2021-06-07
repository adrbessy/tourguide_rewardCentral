package com.tourguide_rewardCentral.unitTest.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.tourguide_rewardCentral.service.RewardCentralService;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class TestRewardCentralController {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  RewardCentralService rewardCentralServiceMock;

  @Test
  public void testGetAttractionRewardPoints() throws Exception {
    UUID userId = UUID.randomUUID();
    UUID attractionId = UUID.randomUUID();
    int points = 5;

    when(rewardCentralServiceMock.getAttractionRewardPoints(attractionId, userId)).thenReturn(points);

    mockMvc.perform(get("/attractionRewardPoints?attractionId=" + attractionId + "&userId=" + userId))
        .andExpect(status().isOk());
  }

}
